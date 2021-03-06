package com.stackroute.musixapp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stackroute.musixapp.exception.SongAlreadyExistsException;
import com.stackroute.musixapp.exception.SongNotExistsException;
import com.stackroute.musixapp.model.Recommend;
import com.stackroute.musixapp.repository.RecommendRepository;

@Service
public class RecommendService {
	@Autowired
	private RecommendRepository rr;

	public Recommend saveModel(Recommend m) throws SongAlreadyExistsException {
		Optional<Recommend> op = rr.findByUsernameAndUrl(m.getUsername(), m.getUrl());
		if (op.isPresent()) {
			throw new SongAlreadyExistsException();
		} else {
			Recommend bk = rr.save(m);
			return bk;
		}

	}

	public List<Recommend> getModelByEmail(String user) throws Exception {

		List<Recommend> l = rr.findAllByUsername(user);
		return l;
	}

	public Recommend removeModel(Recommend recom) throws SongNotExistsException {
		Recommend fav = rr.deleteByUsernameAndUrl(recom.getUsername(), recom.getUrl());
		return fav;

	}

}
