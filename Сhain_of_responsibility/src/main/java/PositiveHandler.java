class PositiveHandler implements Chain
{

    private Chain nextInChain;

    public void setNext(Chain c)
    {
        nextInChain = c;
    }

    public void process(Number request)
    {
        if (request.getNumber() > 0)
        {
            System.out.println("Positive number  Handler: " + request.getNumber());
        }
        else
        {
            nextInChain.process(request);
        }
    }
}