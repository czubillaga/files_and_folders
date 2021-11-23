package com.example.codeclan.files_and_folders.components;

import com.example.codeclan.files_and_folders.models.File;
import com.example.codeclan.files_and_folders.models.Folder;
import com.example.codeclan.files_and_folders.models.User;
import com.example.codeclan.files_and_folders.repositories.FileRepository;
import com.example.codeclan.files_and_folders.repositories.FolderRepository;
import com.example.codeclan.files_and_folders.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    FileRepository fileRepository;

    @Autowired
    FolderRepository folderRepository;

    @Autowired
    UserRepository userRepository;

    public DataLoader() {}

    public void run(ApplicationArguments args) {

        User carlos = new User("Carlos");
        userRepository.save(carlos);
        User oscar = new User("Oscar");
        userRepository.save(oscar);
        User neil = new User("Neil");
        userRepository.save(neil);
        User ali = new User("Ali");
        userRepository.save(ali);
        User cameron = new User("Cameron");
        userRepository.save(cameron);

        Folder homework = new Folder("Homework", carlos);
        folderRepository.save(homework);
        Folder torrentedStuff = new Folder("Torrented Stuff", ali);
        folderRepository.save(torrentedStuff);
        Folder chickenStuff = new Folder("Chicken Stuff", neil);
        folderRepository.save(chickenStuff);
        Folder ceoStuff = new Folder("CEO Stuff", neil);
        folderRepository.save(ceoStuff);
        Folder uxStuff = new Folder("UX Stuff", oscar);
        folderRepository.save(uxStuff);
        Folder tikTokVideos = new Folder("TikTok Videos", cameron);
        folderRepository.save(tikTokVideos);

        File codingHw = new File("coding_homework",".py", 36.7, homework);
        fileRepository.save(codingHw);
        File successionEpisode = new File("Succession_S1E03", ".mp4", 250.76, torrentedStuff);
        fileRepository.save(successionEpisode);
        File chickenCharts = new File("chicken_charts", ".PDF", 48.09, chickenStuff);
        fileRepository.save(chickenCharts);
        File firingList = new File("firing_list", ".txt", 12.3, ceoStuff);
        fileRepository.save(firingList);
        File logoDesign = new File("logo_design", ".PDF", 53.6, uxStuff);
        fileRepository.save(logoDesign);
        File funnyClip = new File("funny_clip", ".mov", 108.5, tikTokVideos);
        fileRepository.save(funnyClip);

    }
}
