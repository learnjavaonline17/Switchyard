package com.learnjavaonline.switchyard.Camel_File_Binding;

import org.switchyard.component.bean.Service;

@Service(FileReader.class)
public class FileReaderImpl implements FileReader {

	@Override
	public void fileReader(String content) {

		System.out.println(content);
	}

}
