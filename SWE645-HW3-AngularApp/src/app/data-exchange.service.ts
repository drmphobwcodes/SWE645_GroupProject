import { Injectable } from '@angular/core';
import { BehaviorSubject } from 'rxjs';
import {Flags} from './models/Flags.model';
import {ApplicationRef } from '@angular/core';

@Injectable()
export class DataExchangeService {

;
  private studentID = new BehaviorSubject('Default Value');
  private flags: Flags = new Flags();
  currentStudentID = this.studentID.asObservable();
  currentFormFlag = this.flags.FormFlag;
  currentACKFlag = this.flags.ACKFlag;
  currentIDsFlag = this.flags.IDsFlag;
  currentReadOnlyFlag = this.flags.ReadonlyFlag;

  constructor() { }

  changeStudentID(message: string): void {
    console.log('changing SID');
    this.studentID.next(message);
  }
  changeFormFlag(): void {
    this.currentFormFlag = !this.currentFormFlag;
  }
  changeACKFlag(): void {
    this.currentACKFlag = !this.currentACKFlag;

  }
  changeIDsFlag(): void {
    this.currentIDsFlag = !this.currentIDsFlag;
  
  }
  changeReadOnlyFlag(): void {
    this.currentReadOnlyFlag = !this.currentReadOnlyFlag;
  }
}
