import { TestBed } from '@angular/core/testing';
import { PlacementComponent } from './placement.component';

describe('PlacementComponent', () => {
  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [PlacementComponent],
    }).compileComponents();
  });

  it('should create the component', () => {
    const fixture = TestBed.createComponent(PlacementComponent);
    const component = fixture.componentInstance;
    expect(component).toBeTruthy();
  });

  it(`should have as title 'Placement Details'`, () => {
    const fixture = TestBed.createComponent(PlacementComponent);
    const component = fixture.componentInstance;
    expect(component.title).toEqual('Placement Details');
  });

  it('should render title', () => {
    const fixture = TestBed.createComponent(PlacementComponent);
    fixture.detectChanges();
    const compiled = fixture.nativeElement as HTMLElement;
    expect(compiled.querySelector('.content span')?.textContent).toContain('Placement Details component is running!');
  });
});
