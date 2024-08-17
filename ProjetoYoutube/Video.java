package ProjetoYoutube;

public class Video implements AcoesVideo {
    private String titulo;
    private int avaliacao;
    private int views;
    private int curtidas;
    private boolean reproduzindo;

    public Video(String titulo) {
        this.titulo = titulo;
        this.avaliacao = 1;
        this.views = 0;
        this.curtidas = 0;
        this.reproduzindo = false;
    }

    @Override
    public void play() {
        // TODO Auto-generated method stub
        this.reproduzindo = true;
    }

    @Override
    public void pause() {
        // TODO Auto-generated method stub
        this.reproduzindo = false;
    }

    @Override
    public void like() {
        // TODO Auto-generated method stub
        this.curtidas++;
    }

    /**
     * @return String return the titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * @param titulo the titulo to set
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * @return int return the avaliacao
     */
    public int getAvaliacao() {
        return avaliacao;
    }

    /**
     * @param avaliacao the avaliacao to set
     */
    public void setAvaliacao(int avaliacao) {
        int nova;
        nova = (int) ((this.avaliacao + avaliacao) / this.views);
        this.avaliacao = nova;

    }

    /**
     * @return int return the views
     */
    public int getViews() {
        return views;
    }

    /**
     * @param views the views to set
     */
    public void setViews(int views) {
        this.views = views;
    }

    /**
     * @return int return the curtidas
     */
    public int getCurtidas() {
        return curtidas;
    }

    /**
     * @param curtidas the curtidas to set
     */
    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }

    /**
     * @return boolean return the reproduzindo
     */
    public boolean getReproduzindo() {
        return reproduzindo;
    }

    /**
     * @param reproduzindo the reproduzindo to set
     */
    public void setReproduzindo(boolean reproduzindo) {
        this.reproduzindo = reproduzindo;
    }

    @Override
    public String toString() {
        return "Video [titulo=" + titulo + ", avaliacao=" + avaliacao + ", views=" + views + ", curtidas=" + curtidas
                + ", reproduzindo=" + reproduzindo + "]";
    }

}
