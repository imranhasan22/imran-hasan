class UnderlineText extends TextDecorator
 {
    public UnderlineText(Text decoratedText) 
    {
        super(decoratedText);
    }

    @Override
    public String getDescription() 
    {
        return decoratedText.getDescription() + ", underline";
    }
}