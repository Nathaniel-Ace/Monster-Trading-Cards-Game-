package at.fhtw.sampleapp.persistence.repository;

import at.fhtw.sampleapp.model.User;

public interface SessionRepository {
    boolean SearchUsername(User user);
}
