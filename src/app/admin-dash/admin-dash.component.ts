import { Component } from '@angular/core';
import { PatientService } from '../patient.service';
import { Patient } from '../patient';

@Component({
  selector: 'app-admin-dash',
  templateUrl: './admin-dash.component.html',
  styleUrls: ['./admin-dash.component.css']
})
export class AdminDashComponent {
   
  patients:Patient[]=[];
searchText: any;
constructor(private patientService:PatientService){}

 ngOnInit():void{
  this.getPatients();
 }

getPatients(){
  this.patientService.getPatientList().subscribe(data=>{
  this.patients=data;
  })
}

}
