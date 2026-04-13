package hospital;

public class Doctor {
    private int DoctorID;
    private static int IDgenerator=0;
    private String doctorName;
    private String doctorSpecialty;
    private int numberOfAvailableAppointmentSlots;
    private int patienTIdCurrentlyAssigned;
    
    public Doctor(){
    DoctorID=IDgenerator;
    ++IDgenerator;
    doctorName="";
    doctorSpecialty="";
    numberOfAvailableAppointmentSlots=0;
    patienTIdCurrentlyAssigned=0;
}
 public void setName(String newName){
     if(newName.length()<=100)
     this.doctorName=newName;
 }
 public void setDoctorSpeciality(String newDoctorSpeciality){
     if(newDoctorSpeciality.length()<=100)
     this.doctorSpecialty=newDoctorSpeciality;
 }
 public void setNumberOfAvailableAppointmentSlots(int newNumberOfAvailableAppointmentSlots){
     if(newNumberOfAvailableAppointmentSlots<=50&&newNumberOfAvailableAppointmentSlots>=0)
     numberOfAvailableAppointmentSlots=newNumberOfAvailableAppointmentSlots;
     }
 
public void setPatienTIdCurrentlyAssigned(int newPatienTIdCurrentlyAssigned){
    patienTIdCurrentlyAssigned=newPatienTIdCurrentlyAssigned;   
}
public void doctorPrint(){
    System.out.println("----------------DOCTOR INFORMATION--------------");
    System.out.println("Doctor Id                = "+DoctorID);
    System.out.println("Doctor Name              = "+doctorName);
    System.out.println("Doctor speciality        = "+doctorSpecialty);
    System.out.println("number of available appointment slots = "+numberOfAvailableAppointmentSlots);
    System.out.println("Patient id currently assigned        = "+patienTIdCurrentlyAssigned);
    System.out.println("-------------------------------------------------");
    
}


}
