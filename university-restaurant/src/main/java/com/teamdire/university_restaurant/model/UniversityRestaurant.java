package com.teamdire.university_restaurant.model;

import java.util.ArrayList;

/**
 *
 * @author Daniel Serezane (Salies)
 */

/*
* Equivalente ao UniRestaurant do projeto.
* Preferi a escrita por extenso.
*/
public class UniversityRestaurant {
    private static ArrayList<Usuario> usuarios = new ArrayList<>();
    private static Usuario usuarioAutenticado = null;

    public static void addUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    public static ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }

    /**
     * Abordagem um pouco diferente da sugerida pelos diagramas de colaboração
     * do projeto. Separei a recuperação da autenticação.
     */
    public static Usuario recuperarUsuario(String cpf) {
        for (Usuario usuario : usuarios) {
            if (usuario.getCpf().equals(cpf)) {
                return usuario;
            }
        }
        return null;
    }

    public static boolean autenticarUsuario(String cpf, String senha) {
        Usuario usuario = recuperarUsuario(cpf);
        if (usuario == null || !usuario.getSenha().equals(senha)) return false;
        usuarioAutenticado = usuario;
        return true;
    }

    public static Usuario getUsuarioAutenticado() {
        return usuarioAutenticado;
    }
}
