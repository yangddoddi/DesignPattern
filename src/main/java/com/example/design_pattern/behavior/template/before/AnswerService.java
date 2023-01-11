package com.example.design_pattern.behavior.template.before;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class AnswerService {
    private final AnswerRepository answerRepository;

    void save() {
        Answer answer = new Answer();
        answerRepository.save(answer);
        answerRepository.delete(answer.id);
    }
}
