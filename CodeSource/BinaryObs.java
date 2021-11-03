class BinaryObs extends Observer {

    public BinaryObs( Theme theme) {
        this.theme = theme; //
        this.theme.attach(this);
    }

    public void modifier() {
        System.out.println("La conversion en base binaire donne:" + Integer.toBinaryString(theme.getState() ) );
    }
}