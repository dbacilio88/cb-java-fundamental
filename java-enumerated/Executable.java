import java.util.HashMap;
import java.util.Map;

public class Executable {

    public static void main(String[] args) {

        System.out.println("150015".substring(0,2));

        System.out.println(Departament.MAP_DEPARTAMENT.get("10").getValue());
    }

    enum Departament {
        AMAZONAS("01", "AMAZONAS"),
        ANCASH("02", "ANCASH"),
        APURIMAC("03", "APURIMAC"),
        AREQUIPA("04", "AREQUIPA"),
        AYACUCHO("05", "AYACUCHO"),
        CAJAMARCA("06", "CAJAMARCA"),
        CALLAO("07", "CALLAO"),
        CUZCO("08", "CUZCO"),
        HUANCAVELICA("09", "HUANCAVELICA"),
        HUANUCO("10", "HUANUCO"),
        ICA("11", "ICA"),
        LA_LIBERTAD("13", "LA LIBERTAD"),
        LAMBAYEQUE("14", "LAMBAYEQUE"),
        LORETO("16", "LORETO"),
        MADRE_DE_DIOS("17", "MADRE DE DIOS"),
        MOQUEGUA("18", "MOQUEGUA"),
        PASCO("19", "PASCO"),
        PIURA("20", "PIURA"),
        PUNO("21", "PUNO"),
        SAN_MARTIN("22", "SAN MARTIN"),
        TACNA("23", "TACNA"),
        TUMBES("24", "TUMBES"),
        UCAYALI("25", "UCAYALI"),
        LIMA("15", "LIMA"),
        JUNIN("12", "JUNIN");

        private static Map<String, Departament> MAP_DEPARTAMENT = new HashMap<>();

        private String code;
        private String value;

        Departament(String code, String value) {
            this.code = code;
            this.value = value;
        }

        public String getCode() {
            return this.code;
        }

        public String getValue() {
            return this.value;
        }

        static {
            for (Departament d : values()) {
                System.out.println(d.code);
                
                MAP_DEPARTAMENT.put(d.getCode(), d);
            }
        }
    }

    enum Enumerated {

        AMAZONAS("01"),
        ANCASH("02"),
        APURIMAC("03"),
        AREQUIPA("04"),
        AYACUCHO("05"),
        CAJAMARCA("06"),
        CALLAO("07"),
        CUZCO("08"),
        HUANCAVELICA("09"),
        HUANUCO("10"),
        ICA("11"),
        LA_LIBERTAD("13"),
        LAMBAYEQUE("14"),
        LORETO("16"),
        MADRE_DE_DIOS("17"),
        MOQUEGUA("18"),
        PASCO("19"),
        PIURA("20"),
        PUNO("21"),
        SAN_MARTIN("22"),
        TACNA("23"),
        TUMBES("24"),
        UCAYALI("25"),
        LIMA("15"),
        JUNIN("12");

        private String code;

        Enumerated(String code) {
            this.code = code;
        }

        public String getCode() {
            return this.code;
        }

        public void setCode(String code) {
            this.code = code;
        }

        public static Enumerated getCodeUbigeo(String code) {

           
            for (Enumerated e : values()) {
                if (e.code.equals(code)) {
                    return e;
                }
            }

            return null;
        }
    }

}
