class traduction_Buffer{
    public static void main(String []args ){
        StringBuffer text;
        String mot1,mot2;

        System.out.println("saisir un text");
        text=new StringBuffer(Clavier.lireString());

        System.out.println("saisir mot1");
        mot1=Clavier.lireString();

        System.out.println("saisir un mot2");
        mot2=Clavier.lireString();

        if (text.indexOf(mot1) == -1) {
            System.out.println("Mot1 n'existe pas dans le texte.");
        } else {
            text = new StringBuffer(text.toString().replace(mot1, mot2));
            System.out.println("Le nouveau texte est : " + text);
        }
    }
}