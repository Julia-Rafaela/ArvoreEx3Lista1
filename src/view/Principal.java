package view;

import model.Arvore;

public class Principal {

	public static void main(String[] args) {
        char[] vetor = {'M', 'F', 'S', 'D', 'J', 'P','U','A','E','H','Q','T','W','K'};
        Arvore arvore = new Arvore();
        for (char i : vetor) {
            arvore.insert(i);
        }
        try {
        	arvore.remove('F');
        	arvore.remove('U');
        	System.out.print("pré-ordem: ");
            arvore.prefixSearch();
            System.out.println();
            System.out.print("ordem crescente: ");
            arvore.infixSearch();
            System.out.println();
            System.out.print("pós-ordem: ");
            arvore.postfixSearch();
            System.out.println();
 
        } catch (Exception e) {
            e.printStackTrace();
        }
 
        System.out.println();
    }


}
