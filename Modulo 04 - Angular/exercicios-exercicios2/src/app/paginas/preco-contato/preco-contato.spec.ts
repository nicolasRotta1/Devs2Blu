import { ComponentFixture, TestBed } from '@angular/core/testing';

import { PrecoContato } from './preco-contato';

describe('PrecoContato', () => {
  let component: PrecoContato;
  let fixture: ComponentFixture<PrecoContato>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [PrecoContato]
    })
    .compileComponents();

    fixture = TestBed.createComponent(PrecoContato);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
