class OctaleObs extends Observer {

    public OctaleObs (Theme theme) {
        this.theme = theme;
        this.theme.attach(this);
    }

    public void modifier() {
        System.out.println("la conversion en base octale donne:" + Integer.toOctaleString(theme.getState() ) );
    }
}