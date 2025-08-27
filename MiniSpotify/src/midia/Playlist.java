package midia;

import usuario.Usuario;

public class Playlist {
    private String nomePlaylist;
    private Usuario usuario;

    public String getNomePlaylist() {
        return nomePlaylist;
    }

    public void setNomePlaylist(String nomePlaylist) {
        this.nomePlaylist = nomePlaylist;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public Playlist(String nomePlaylist, Usuario usuario) {
        this.nomePlaylist = nomePlaylist;
        this.usuario = usuario;
    }
}
