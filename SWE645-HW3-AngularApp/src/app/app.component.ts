import {ApplicationRef, Component} from '@angular/core';
import {DataExchangeService} from './data-exchange.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css'],
})
export class AppComponent {
  title = 'swe645-HW3-AngularApp';
  constructor(public DS: DataExchangeService) {
  }

}
