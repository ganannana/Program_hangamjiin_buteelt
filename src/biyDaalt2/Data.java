package biyDaalt2;
import java.time.*;
import java.time.temporal.ChronoUnit;
import java.util.*;
public class Data {
	int ajiliin_honog;
	int angilal_too;
	float jil, tsag, hugatsaa;
	int dund_sur_ehleh_on;
	float dund_sur_niit_jil = 0;
	int sonirholtoi_tsag = 4;
	Scanner in = new Scanner(System.in);
    Hashtable<DayOfWeek, Integer>
    day_of_the_week = new Hashtable<DayOfWeek, Integer>();
    public Data() {
		day_of_the_week.put(DayOfWeek.MONDAY, 1);
	    day_of_the_week.put(DayOfWeek.TUESDAY, 2);
	    day_of_the_week.put(DayOfWeek.WEDNESDAY, 3);
	    day_of_the_week.put(DayOfWeek.THURSDAY, 4);
	    day_of_the_week.put(DayOfWeek.FRIDAY, 5);
	    day_of_the_week.put(DayOfWeek.SATURDAY, 6);
	    day_of_the_week.put(DayOfWeek.SUNDAY, 7);
	}
	public void set_ajiliin_honog(int ajiliin_honog) {
		this.ajiliin_honog = ajiliin_honog;
	}
	public void set_angilal_too(int angilal_too) {
		this.angilal_too = angilal_too;
	}
	int[] angilal = new int[4];
	float[][] angilal_data = new float[4][7];
	public void set_angilal_data() {
		for(int i = 0; i<angilal_too; i++) {
			System.out.println(i+1 + "-r angilal");
			System.out.println(i+1 + "-r angilald sursan jiliin too:");
			jil = in.nextFloat();
			angilal_data[i][0] =jil;
			dund_sur_niit_jil = dund_sur_niit_jil + jil;
			System.out.println(i+1 + "-r angilald udurt uzeh tsagiin too:");
			tsag =  in.nextFloat();
			angilal_data[i][1] =tsag;
			System.out.println(i+1 + "-r angilald udurt uzeh tsagiin hargalzah hugatsaa:");
			hugatsaa =  in.nextFloat();
			angilal_data[i][2] =hugatsaa;	
		}
	}
	public void set_dund_sur_ehleh_on(int ehleh_on) {
		DayOfWeek dayOfWeek;
		int honog = 1;
		int check_honog;
		int duusah_honog = 31;
		int butarhai_hicheellesen_honog = 0;
		int butarhai_honog = 0;
		float angilal_niit_buten_doloo_honog=0;
		float angilal_niit_hicheellesen_honog=0;
		int jiliin_niit_honog;
		float jiliin_buten_doloo_honog=0;
		float jiliin_niit_hicheellesen_honog=0;
		double hicheellesen_hugatsaa;
		int check=0;
		this.dund_sur_ehleh_on = ehleh_on;
		int duusah_on = ehleh_on+1;
		for(int i = 0; i < angilal_too; i++) {
			check++;
			for(int j = 0; j<angilal_data[i][0]; j++) {
				jiliin_niit_honog = (int) ChronoUnit.DAYS.between(LocalDate.of(ehleh_on, 9, 1), LocalDate.of(duusah_on, 6, 1));
				System.out.println("jiliin_niit_honog: "+jiliin_niit_honog);
				dayOfWeek = LocalDate.of(ehleh_on, 9, 1).getDayOfWeek();
				check_honog = day_of_the_week.get(dayOfWeek);
				System.out.println("ehleh_on: "+ehleh_on);
				System.out.println("dayOfWeek: "+dayOfWeek);
				System.out.println("check_honog: "+check_honog);
				while(check_honog != 1) {
					if(check_honog != 6 && check_honog != 7) {
						butarhai_hicheellesen_honog++;
					}
					butarhai_honog++;
					check_honog++;	
					System.out.println("check_honog: "+check_honog);
					if(check_honog == 8) {
						check_honog = 1;
					}
				}
				dayOfWeek = LocalDate.of(duusah_on, 5, 31).getDayOfWeek();
				System.out.println("duusah_on: "+duusah_on);
				System.out.println("dayOfWeek: "+dayOfWeek);
				check_honog = day_of_the_week.get(dayOfWeek);
				System.out.println("check_honog: "+check_honog);
				while(check_honog != 7) {
					if(check_honog != 6 && check_honog != 7) {
						butarhai_hicheellesen_honog++;
					}
					butarhai_honog++;
					check_honog--;
					System.out.println("check_honog: "+check_honog);
					if(check_honog == 0) {
						check_honog = 7;
					}
				}
				System.out.println("butarhai_honog: "+butarhai_honog);
				System.out.println("butarhai_hicheellesen_honog: "+butarhai_hicheellesen_honog);
				System.out.println("jiliin_niit_honog: "+jiliin_niit_honog);
				jiliin_buten_doloo_honog = (jiliin_niit_honog - butarhai_honog)/7;
				jiliin_niit_hicheellesen_honog = jiliin_buten_doloo_honog*ajiliin_honog+butarhai_hicheellesen_honog;
				ehleh_on = duusah_on;
				duusah_on++;
				angilal_niit_buten_doloo_honog = angilal_niit_buten_doloo_honog +jiliin_buten_doloo_honog;
				angilal_niit_hicheellesen_honog = angilal_niit_hicheellesen_honog + jiliin_niit_hicheellesen_honog;
				butarhai_hicheellesen_honog = 0;
				butarhai_honog = 0;
				System.out.println("jiliin_buten_doloo_honog: "+jiliin_buten_doloo_honog);
				System.out.println("jiliin_niit_hicheellesen_honog: "+jiliin_niit_hicheellesen_honog);
				System.out.println("angilal_niit_buten_doloo_honog: "+angilal_niit_buten_doloo_honog);
				System.out.println("angilal_niit_hicheellesen_honog: "+angilal_niit_hicheellesen_honog);
				
				
			}
			angilal_data[i][3] = angilal_niit_buten_doloo_honog;
			angilal_data[i][4] = angilal_niit_hicheellesen_honog;
			angilal_data[i][5] = (angilal_niit_hicheellesen_honog*(angilal_data[i][1]*angilal_data[i][2]))/60; // niit hicheellesen hugatsaa
			angilal_data[i][6] = (angilal_niit_buten_doloo_honog*sonirholtoi_tsag*angilal_data[i][2])/60; // niit sonirholtoi tsag
				angilal_niit_hicheellesen_honog = 0;
				angilal_niit_buten_doloo_honog = 0;
				
			
			
		}
		
	}
	public float get_dund_sur_suraltsah_tsag() {
		float dund_sur_suraltsah_tsag = 0;
		for(int i = 0; i < angilal_too-1; i++) {
			dund_sur_suraltsah_tsag+=angilal_data[i][5];
		}
		return dund_sur_suraltsah_tsag;
	}
	public float get_dund_sur_sonirholtoi_hugatsaa() {
		float dund_sur_sonirholtoi_hugatsaa = 0;
		for(int i = 0; i < angilal_too-1; i++) {
			dund_sur_sonirholtoi_hugatsaa+=angilal_data[i][6];
		}
		return dund_sur_sonirholtoi_hugatsaa;
	}
	public float get_dund_sur_buten_doloo_honog() {
		float dund_sur_buten_doloo_honog = 0;
		for(int i = 0; i < angilal_too-1; i++) {
			dund_sur_buten_doloo_honog+=angilal_data[i][3];
		}
		return dund_sur_buten_doloo_honog;
	}
	public float get_dund_sur_hicheellesen_honog() {
		float dund_sur_hicheellesen_honog = 0;
		for(int i = 0; i < angilal_too-1; i++) {
			dund_sur_hicheellesen_honog+=angilal_data[i][4];
		}
		return dund_sur_hicheellesen_honog;
	}
	
	
	
	
	public float ih_sur_suraltsah_tsag() {
		float ih_sur_suraltsah_tsag = 0;
			ih_sur_suraltsah_tsag = angilal_data[angilal_too-1][5];
		return ih_sur_suraltsah_tsag;
	}
	public float ih_sur_sonirholtoi_hugatsaa() {
		float ih_sur_sonirholtoi_hugatsaa = 0;
		
			ih_sur_sonirholtoi_hugatsaa = angilal_data[angilal_too-1][6];
		return ih_sur_sonirholtoi_hugatsaa;
	}
	public float ih_sur_buten_doloo_honog() {
		float ih_sur_buten_doloo_honog = 0;
			ih_sur_buten_doloo_honog = angilal_data[angilal_too-1][3];
		return ih_sur_buten_doloo_honog;
	}
	public float ih_sur_hicheellesen_honog() {
		float ih_sur_hicheellesen_honog = 0;
		
			ih_sur_hicheellesen_honog = angilal_data[angilal_too-1][4];
		
		return ih_sur_hicheellesen_honog;
	}
	
	public float ih_dadlagiin_ezleh_huvi() {
		float ih_dadlagiin_ezleh_huvi = 0;
			ih_dadlagiin_ezleh_huvi = 32*5*100/angilal_data[angilal_too-1][4];
		
		return ih_dadlagiin_ezleh_huvi;
	}
	
	
}
