import { platformBrowserDynamic } from '@angular/platform-browser-dynamic';
import { PlacementModule } from './app/placement.module';

platformBrowserDynamic()
  .bootstrapModule(PlacementModule)
  .catch((err) => console.error(err));
