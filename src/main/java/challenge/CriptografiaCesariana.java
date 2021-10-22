package challenge;

public class CriptografiaCesariana implements Criptografia {

	@Override
    public String criptografar(String texto) {
        if (texto.length() == 0) throw new IllegalArgumentException("Texto não pode ser vazio!");

        String minusculo = texto.toLowerCase();
        String cifrado = "";
        int index = 0;

        do {
        	char aux = minusculo.charAt(index);
        	int auxNumber = (int) aux;
        	if (auxNumber > 96 && auxNumber < 123) {
        		aux = (char) (aux + 3);
        	}
        	cifrado += aux;
            index += 1;
        } while(index < minusculo.length());

        return cifrado;
    }

    @Override
    public String descriptografar(String texto) {
    	if (texto.length() == 0) throw new IllegalArgumentException("Texto não pode ser vazio!");

        String minusculo = texto.toLowerCase();
        String normal = "";
        int index = 0;
        
        do {
        	char aux = minusculo.charAt(index);
        	int auxNumber = (int) aux;
        	if (auxNumber > 96 && auxNumber < 123) {
        		aux = (char) (aux - 3);
        	}
        	normal += aux;
            index += 1;
        } while(index < minusculo.length());

        return normal;
    }
    
}

