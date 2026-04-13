package hospital;

public class Patient {
  private int patientId=0;
  private static int idGenerator=150;
  private String patientName;
  private static int numberOfPatient=0;
  private String phone_N0;
  private String patientPreferDoctorId;
public Patient(){
    patientId=idGenerator++;
    patientName="";
    ++numberOfPatient;
    phone_N0="Null";
    patientPreferDoctorId="Null";
}
public void setName(String newName){
    if(newName.length()<=100){
    this.patientName+=newName;
    }
}

public void setPhoneNumber(String newNo){
    
    if(newNo.length()==10){
    if(newNo.charAt(0)=='0'&&newNo.charAt(1)=='5'){
    try{
    Integer.parseInt(newNo);   
      phone_N0=newNo;
    }catch(NumberFormatException e){
    System.out.println("your phone number .....");
         
    }
    }
    }
   
}

public void setPreferDoctorId(String PPDID){
    if(PPDID.length()==10){
        try{
        Integer.parseInt(PPDID);
        patientPreferDoctorId=PPDID;
        }catch(NumberFormatException z){
          System.out.println("This can't be a doctor Id");

        }
        }
}

public static int returnNumberOfPatient(){
    return numberOfPatient;
}

public int returnPatientID(){
    return patientId;
    
}
public void patientPrint(){
    System.out.println("----------------PATIENT INFORMATION--------------");
    System.out.println("Patient Id               = "+patientId);
    System.out.println("Patient Name             = "+patientName);
    System.out.println("Patient phone number     = "+phone_N0);
    System.out.println("Patient prefer doctor Id = "+patientPreferDoctorId);
    System.out.println("Number of patient        = "+numberOfPatient);
    System.out.println("-------------------------------------------------");
    
}
}

