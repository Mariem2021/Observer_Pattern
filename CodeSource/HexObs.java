class HexObs extends Observer {

    public HexObs (Theme theme) {
        this.theme = theme;
        this.theme.attach(this);
    }

    public void modifier() {
        System.out.println("La conversion en base Hexadecimale donne:" + Integer.toHexString(theme.getState() ) );
    }
}