public class TextEditor 
{
    public static void main(String[] args) 
    {
        Text myText = new PlainText("This is DP");

        System.out.println(myText.getDescription());
        Text boldText = new BoldText(myText);
        System.out.println(boldText.getDescription());
        Text boldItalicText = new ItalicText(boldText);
        System.out.println(boldItalicText.getDescription());
        Text underlineBoldItalicText = new UnderlineText(boldItalicText);
        System.out.println(underlineBoldItalicText.getDescription());
    }
}