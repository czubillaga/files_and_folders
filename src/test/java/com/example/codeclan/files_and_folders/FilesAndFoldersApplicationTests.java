package com.example.codeclan.files_and_folders;

import com.example.codeclan.files_and_folders.models.File;
import com.example.codeclan.files_and_folders.models.Folder;
import com.example.codeclan.files_and_folders.models.User;
import com.example.codeclan.files_and_folders.repositories.FileRepository;
import com.example.codeclan.files_and_folders.repositories.FolderRepository;
import com.example.codeclan.files_and_folders.repositories.UserRepository;
import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class FilesAndFoldersApplicationTests {

	File file;
	Folder folder;
	User user;

	@Autowired
	UserRepository userRepository;

	@Autowired
	FolderRepository folderRepository;

	@Autowired
	FileRepository fileRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void canAddFiles() {
		user = new User("Carlos");
		userRepository.save(user);
		folder = new Folder("Project", user);
		folderRepository.save(folder);
		file = new File("Runner", ".java", 2.56, folder);
		fileRepository.save(file);

		folder.addFile(file);
		folderRepository.save(folder);

		user.addFolder(folder);
		userRepository.save(user);
	}

}
