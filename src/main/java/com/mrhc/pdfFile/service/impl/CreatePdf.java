package com.mrhc.pdfFile.service.impl;

import java.io.FileNotFoundException;
import com.itextpdf.text.DocumentException;
import java.io.FileOutputStream;
import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

public class CreatePdf {
	public boolean createPdf()
	{
		try {
			Document document = new Document();
			@SuppressWarnings("unused")
			PdfWriter pdfWriter = PdfWriter.getInstance(document, new FileOutputStream("HelloWorld.pdf"));
			document.open();
			Paragraph paragraph = new Paragraph();
			paragraph.add("Hello World!");
			document.add(paragraph);
			document.add(paragraph);
			document.close();
			return true;
		} catch (Exception e){
			System.out.println("Something went wrong:" + e.getMessage());
			return false;
		}
	}
}
