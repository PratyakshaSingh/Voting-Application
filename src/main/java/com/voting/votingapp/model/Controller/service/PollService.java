package com.voting.votingapp.model.Controller.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.voting.votingapp.Repositories.PollRepository;
import com.voting.votingapp.model.Poll;
@Service
public class PollService {
    private PollRepository pollRepository;
    public PollService(PollRepository pollRepository)
    {
        this.pollRepository=pollRepository;
    }
    public Poll createPoll(Poll poll) {
        return pollRepository.save(poll);
    }
    public List<Poll> getAllPolls() {
       return pollRepository.findAll();
    }
    
}
