package hospital;
import java.util.Scanner;
public class hospital_main {

   
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int x,d=0;
        int z=0;
        Patient[] patient=new Patient[150];
        Doctor[] doctor=new Doctor[150];
        
        do{
        System.out.println("Choose one of the following options ");
        System.out.println("1:Add new patient");
        System.out.println("2:Add new doctor");
        System.out.println("3:print all patients information");
        System.out.println("4:print all doctors information");
        System.out.println("5:Quit");
    
        
        x=input.nextInt();
        if(x==1){
        patient[z]=new Patient();
        
        input.nextLine();
        System.out.println("Enter the patient name ");
        patient[z].setName(input.nextLine());
        
        
        System.out.println("Enter the patient phone number ");
        patient[z].setPhoneNumber(input.next());
        
        System.out.println("Enter the prefer doctor ID ");
        patient[z].setPreferDoctorId(input.next());
        z++;
        }
        else if(x==2){
        doctor[d]=new Doctor();
        
        input.nextLine();
        System.out.println("Enter the Doctor name");
        doctor[d].setName(input.nextLine());
        
        System.out.println("Enter the doctor speciality");
        doctor[d].setDoctorSpeciality(input.next());
        
        System.out.println("Enter number of available appointment slots");
        doctor[d].setNumberOfAvailableAppointmentSlots(input.nextInt());
        
        System.out.println("Enter the patient id currently assigned");
        int check=input.nextInt();
        for (int i=0; i<z;i++){
            if(patient[i]==null)
                break;
            if(check==patient[i].returnPatientID())
            doctor[d].setPatienTIdCurrentlyAssigned(check);
        }
        d++;
        }
        else if(x==3){
        for(int i=0;i<patient.length;i++){
        
        if(patient[i]!=null)
        patient[i].patientPrint();
        }   
        }
        else if(x==4){
        for(int a=0;a<patient.length;a++){
            
        if(doctor[a]!=null)
        doctor[a].doctorPrint();
        }
        
        }
        
        }while(x!=5);
        }
    }