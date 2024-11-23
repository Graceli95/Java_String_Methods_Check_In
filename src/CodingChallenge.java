public class CodingChallenge {
    public void check(){
        String str = "Developers";
        boolean containsDev = str.contains("Dev");
        System.out.println(containsDev);
        boolean startswithDe = str.startsWith("De");
        System.out.println("Does the string contain 'De'? " + startswithDe);
        System.out.println("Does the string contain 'Dev'? " + containsDev);
    }
}
