class traduction{
    public static void main(String []args ){
        String text,mot1,mot2;
        System.out.println("saisir un text");
        text=Clavier.lireString();
        System.out.println("saisir mot1");
        mot1=Clavier.lireString();
        System.out.println("saisir un mot2");
        mot2=Clavier.lireString();
        if(text.indexOf(mot1) == -1){
            System.out.println("mot1 n'existe pas dans le text");
        }
        else{
            text=text.replace(mot1, mot2);
            System.out.println("le nouveau text est: " +text);
        }



























































































    }
}