package caiquegoncalvesdossantos;

import java.io.File;
import java.io.IOException;
import javax.swing.filechooser.FileSystemView;
import javax.swing.JFileChooser;

//script de criação de arquivos padronizados

public class CriarArquivos {
    public static void main(String[] args) {
        JFileChooser chooser = new JFileChooser();

        chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);


        int returnValue = chooser.showOpenDialog(null);
        if (returnValue == JFileChooser.APPROVE_OPTION) {
            File selectedPath = chooser.getSelectedFile();
            System.out.println("Diretório selecionado: " + selectedPath.getAbsolutePath());
        
            for (int i = 4; i <= 32; i++) {
            String nomeArquivo = "Ex" + i + ".java";
            File arquivo = new File(selectedPath, nomeArquivo);
            try {
                if (arquivo.createNewFile()) {
                    System.out.println("Arquivo criado: " + arquivo.getAbsolutePath());
                } else {
                    System.out.println("Arquivo já existe: " + arquivo.getAbsolutePath());
                }
            } catch (IOException e) {
                System.out.println("Ocorreu um erro ao criar o arquivo: " + arquivo.getAbsolutePath());
            }
        }
       } else{
            System.out.println("Nenhuma pasta foi selecionada.");
        }
    }
}