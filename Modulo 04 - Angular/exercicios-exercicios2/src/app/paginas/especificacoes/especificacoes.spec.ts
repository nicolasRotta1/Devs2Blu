import { ComponentFixture, TestBed } from '@angular/core/testing';

import { Especificacoes } from './especificacoes';

describe('Especificacoes', () => {
  let component: Especificacoes;
  let fixture: ComponentFixture<Especificacoes>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [Especificacoes]
    })
    .compileComponents();

    fixture = TestBed.createComponent(Especificacoes);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
