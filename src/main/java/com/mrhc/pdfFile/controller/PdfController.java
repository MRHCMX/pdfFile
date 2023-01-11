package com.mrhc.pdfFile.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import io.swagger.annotations.ApiOperation;
import com.mrhc.pdfFile.service.impl.*;

@RestController
@ApiOperation("Controller for pdfFile app")

public class PdfController {
	private static final Logger LOG = LoggerFactory.getLogger(PdfController.class);
	@GetMapping("/helloWorld")
	public Object helloWorld() 
	{
		LOG.info("executed CronController helloWorld");
		CreatePdf pdf = new CreatePdf();
		return pdf.createPdf();
	}
	
	@GetMapping("/chunkPdf")
	public Object chunkPdf() 
	{
		LOG.info("executed CronController chunkPdf");
		ChunkExample pdf = new ChunkExample();
		return pdf.chunkPdf();
	}
	
	@GetMapping("/phrasePdf")
	public Object phrasePdf() 
	{
		LOG.info("executed CronController PhrasePdfSample");
		PhrasePdfSample pdf = new PhrasePdfSample();
		return pdf.phrasePdf();
	}
	
	@GetMapping("/paragraphPdf")
	public Object paragraphPdf() 
	{
		LOG.info("executed CronController PhrasePdfSample");
		ParagraphExample pdf = new ParagraphExample();
		return pdf.paragraphPdf();
	}
	
	@GetMapping("/FontPdf")
	public Object FontPdf() 
	{
		LOG.info("executed CronController PhrasePdfSample");
		FontPdfExample pdf = new FontPdfExample();
		return pdf.fondPdf();
	}
}
