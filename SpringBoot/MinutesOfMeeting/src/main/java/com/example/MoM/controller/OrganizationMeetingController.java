package com.example.MoM.controller;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.MoM.dto.OrganizationMeetingDto;
import com.example.MoM.entity.OrganizationMeetingEntity;
import com.example.MoM.repositories.OrganizationMeetingRepository;

@RestController
@RequestMapping("/meeting")
public class OrganizationMeetingController {

	@Autowired
	private OrganizationMeetingRepository organizationMeetingRepository;

	@Autowired
	private ModelMapper mapper;

	@GetMapping("/all")
	public List<OrganizationMeetingDto> getAll() {
		List<OrganizationMeetingEntity> list = organizationMeetingRepository.findAll();
		List<OrganizationMeetingDto> dtos = new ArrayList<OrganizationMeetingDto>();
		for (OrganizationMeetingEntity entity : list) {
			dtos.add(mapper.map(entity, OrganizationMeetingDto.class));
		}

		return dtos;
	}

	@PostMapping("/save")
	public OrganizationMeetingDto save(@RequestBody OrganizationMeetingEntity organizationMember) {
		OrganizationMeetingEntity entity = organizationMeetingRepository.save(organizationMember);
		return mapper.map(entity, OrganizationMeetingDto.class);
	}

	@GetMapping("/byId/{id}")
	public OrganizationMeetingDto save(@PathVariable("id") int id) {
		OrganizationMeetingEntity entity = organizationMeetingRepository.findById(id)
				.orElse(new OrganizationMeetingEntity());
		return mapper.map(entity, OrganizationMeetingDto.class);
	}

	@DeleteMapping("/")
	public void delete(@RequestBody OrganizationMeetingEntity organizationMember) {
		organizationMeetingRepository.delete(organizationMember);
	}

}
