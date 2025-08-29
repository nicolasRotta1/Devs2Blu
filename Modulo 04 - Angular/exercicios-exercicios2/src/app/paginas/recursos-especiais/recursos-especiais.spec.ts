import { ComponentFixture, TestBed } from '@angular/core/testing';

import { RecursosEspeciais } from './recursos-especiais';

describe('RecursosEspeciais', () => {
  let component: RecursosEspeciais;
  let fixture: ComponentFixture<RecursosEspeciais>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [RecursosEspeciais]
    })
    .compileComponents();

    fixture = TestBed.createComponent(RecursosEspeciais);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
