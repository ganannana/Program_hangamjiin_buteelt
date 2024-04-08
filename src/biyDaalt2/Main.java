package biyDaalt2;

public class Main {
    public static void main(String[] args) {
        Data case1 = new Data();
        case1.set_ajiliin_honog(6);
        case1.set_angilal_too(4);
        case1.set_angilal_data();
        case1.set_dund_sur_ehleh_on(1978);
        
        Data case2 = new Data();
        case2.set_ajiliin_honog(5);
        case2.set_angilal_too(3);
        case2.set_angilal_data();
        case2.set_dund_sur_ehleh_on(2006);

//         Call the methods and store the returned values
        float dund_sur_sonirholtoi_hugatsaa = case1.get_dund_sur_sonirholtoi_hugatsaa();
        float dund_sur_suraltsah_tsag = case1.get_dund_sur_suraltsah_tsag();

        // Print the calculated values
        System.out.println("===================================================================================");
        System.out.println("Dund sur niit buten 7 honog: " + case1.get_dund_sur_buten_doloo_honog());
        System.out.println("Dund sur niit honog: " + case1.get_dund_sur_hicheellesen_honog());
        System.out.println("Dund sur sonirholtoi hugatsaa: " + dund_sur_sonirholtoi_hugatsaa+" tsag");
        System.out.println("Dund sur suraltsah niit tsag: " + dund_sur_suraltsah_tsag+" tsag");
        
        System.out.println("Ih sur niit buten 7 honog: " + case1.ih_sur_buten_doloo_honog());
        System.out.println("Ih sur niit honog: " + case1.ih_sur_hicheellesen_honog());
        System.out.println("Ih sur suraltsah niit tsag: " + case1.ih_sur_suraltsah_tsag()+" tsag");
        System.out.println("Ih sur ih_dadlagiin_ezleh_huvi: " + case1.ih_dadlagiin_ezleh_huvi()+" %");
        
        System.out.println("===================================================================================");
        System.out.println("Dund sur niit buten 7 honog: " + case2.get_dund_sur_buten_doloo_honog());
        System.out.println("Dund sur niit honog: " + case2.get_dund_sur_hicheellesen_honog());
        System.out.println("Dund sur sonirholtoi hugatsaa: " + case2.get_dund_sur_sonirholtoi_hugatsaa()+" tsag");
        System.out.println("Dund sur suraltsah niit tsag: " + case2.get_dund_sur_suraltsah_tsag()+" tsag");
        
        System.out.println("Ih sur niit buten 7 honog: " + case2.ih_sur_buten_doloo_honog());
        System.out.println("Ih sur niit honog: " + case2.ih_sur_hicheellesen_honog());
        System.out.println("Ih sur suraltsah niit tsag: " + case2.ih_sur_suraltsah_tsag()+" tsag");
        System.out.println("Ih sur ih_dadlagiin_ezleh_huvi: " + case2.ih_dadlagiin_ezleh_huvi()+" %");
        System.out.println("===================================================================================");
        
        
    }
}
