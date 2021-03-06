package org.exprimu.prog.metier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;

import java.util.Date;
import java.util.List;
import org.springframework.data.domain.PageRequest;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;
import org.exprimu.prog.dao.DocumentRepository;
import org.exprimu.prog.entity.Document;
import org.exprimu.prog.entity.Utilisateur;
import org.exprimu.prog.metierImp.DocumentMetierImp;

@Service
public class DocumentMetier implements DocumentMetierImp {
	@Autowired
	private DocumentRepository documentRepository;

	@Override
	public Page<Document> documentPage(int page, int size) {
		return documentRepository.findAll(new PageRequest(page, size));
	}

	@Override
	public List<Document> documentList() {
		return documentRepository.findAll();
	}

	@Override
	public Document getDocument(Long id) {
		return documentRepository.findOne(id);
	}

	@Override
	public Document save(Document document) {
		document.setDateCreation(new Date());
		return documentRepository.save(document);
	}

	@Override
	public void delete(Long id) {
		documentRepository.delete(documentRepository.findOne(id));
	}

	@Override
	public List<Document> getAllDocumentPDFByIdPublication(Long idPublication) {
		return documentRepository.getAllDocumentPDFByIdPublication(idPublication);
	}
	@Override
	public List<Document> getAllDocumentPDFByIdUtilisateur(Long idUtilisateur) {
		// TODO Auto-generated method stub
		return documentRepository.getAllDocumentPDFByIdUtilisateur(idUtilisateur);
	}
	@Override
	public List<Document> getAllDocumentIMGByIdUtilisateur(Long idUtilisateur) {
		// TODO Auto-generated method stub
		return documentRepository.getAllDocumentIMGByIdUtilisateur(idUtilisateur);
	}
	

}
