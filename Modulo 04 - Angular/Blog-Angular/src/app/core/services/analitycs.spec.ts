import { TestBed } from '@angular/core/testing';

import { Analitycs } from './analitycs';

describe('Analitycs', () => {
  let service: Analitycs;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(Analitycs);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
