package com.mrhc.pdfFile.service.impl;

import java.io.FileNotFoundException;
import com.itextpdf.text.DocumentException;
import java.io.FileOutputStream;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.pdf.PdfWriter;

public class ChunkExample {
	public boolean chunkPdf()
	{
		try {
			Document document = new Document();
			@SuppressWarnings("unused")
			PdfWriter pdfWriter = PdfWriter.getInstance(document, new FileOutputStream("chunkPdf.pdf"));
			document.open();
			
			for(int count = 0;count<10;count++)
			{
				Chunk chunk = new Chunk("Hello World!!");
				document.add(chunk);
			}
			
			document.close();
			return true;
		} catch (Exception e) {
			System.out.println("Something went wrong:" + e.getMessage());
			return false;
		}
	}
}
