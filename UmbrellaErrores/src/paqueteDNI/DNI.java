package paqueteDNI;

public class DNI {
    private static final String CONTROL_DIGITS = "TRWAGMYFPDXBNJZSQVHLCKE";
    private int dni;
    private char letter;

    public DNI(int dni) {this.letter=calcularLetraNIF(dni);}

    public DNI(String nif) {
        if (validarNIF(nif)){
            this.dni=extraerNumeroNIF(nif);
            this.letter=extraerLetraNIF(nif);

        }else{
            throw new NifIntroducidoException("El NIF es incorrecto");
        }
    }

    public int getDNI() {
        return this.dni;
    }

    public String getNIF() {
        return "" + String.format("%08d",this.dni) + this.letter;
    }

    public void setDNI(String nif) {
        if(!validarNIF(nif)) throw new IllegalArgumentException("No es un dni válido, el dígito de control debe ser " + calcularLetraNIF(extraerNumeroNIF(nif)));
        this.setDNI(extraerNumeroNIF(nif));
    }

    public void setDNI(int dni) {
        if (dni < 1 || dni > 99999999) throw new IllegalArgumentException("El DNI no es válido");
        this.dni = dni;
        this.letter = calcularLetraNIF(dni);
    }

    private static void validarDNI(int dni) {
    }

    private static char calcularLetraNIF(int dni) {
        if (dni < 1 || dni > 99999999) throw new IllegalArgumentException("El DNI no es válido");
        return CONTROL_DIGITS.charAt(dni % 23);
    }

    private static boolean validarNIF(String nif) {
        if (nif.length() > 10 || nif.length() < 2) return false;
        if (!nif.matches("[1-9]\\d{0,7}[" + CONTROL_DIGITS + "]")) return false;
        return extraerLetraNIF(nif) == calcularLetraNIF(extraerNumeroNIF(nif));
    }

    private static char extraerLetraNIF(String nif) {
        return nif.charAt(nif.length() - 1);
    }

    private static int extraerNumeroNIF(String nif) {
        return Integer.parseInt(nif.substring(0, nif.length() - 1));
    }
}
