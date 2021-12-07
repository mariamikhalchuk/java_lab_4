public class Main {

    public static void main(String[] args) {

        DrawAnimation drawAnimation = new DrawAnimation("Draw Artist", "Draw Style");
        PuppetAnimation puppetAnimation = new PuppetAnimation("Puppet Artist", "Puppet Style");
        Historical historical = new Historical("Historical period", 1);
        Musical musical = new Musical("Msical instrument", 30);

        drawAnimation.title();
        drawAnimation.print();

        puppetAnimation.title();
        puppetAnimation.print();

        historical.title();
        historical.print();

        musical.title();
        musical.print();

    }
}
