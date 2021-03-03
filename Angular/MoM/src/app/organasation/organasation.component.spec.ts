import { ComponentFixture, TestBed } from '@angular/core/testing';

import { OrganasationComponent } from './organasation.component';

describe('OrganasationComponent', () => {
  let component: OrganasationComponent;
  let fixture: ComponentFixture<OrganasationComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ OrganasationComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(OrganasationComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
