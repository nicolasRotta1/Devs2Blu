import { ComponentFixture, TestBed } from '@angular/core/testing';

import { Ex01 } from './ex01';

describe('Ex01', () => {
  let component: Ex01;
  let fixture: ComponentFixture<Ex01>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [Ex01]
    })
    .compileComponents();

    fixture = TestBed.createComponent(Ex01);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
