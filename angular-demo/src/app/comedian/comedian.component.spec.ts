import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ComedianComponent } from './comedian.component';

describe('ComedianComponent', () => {
  let component: ComedianComponent;
  let fixture: ComponentFixture<ComedianComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ComedianComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ComedianComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
