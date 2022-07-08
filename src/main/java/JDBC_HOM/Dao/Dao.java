package JDBC_HOM.Dao;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

public interface Dao <T,K>{
    List<T> getAll() throws SQLException;
    Optional<T> getById(K id) throws SQLException;
    void insert(T objects) throws SQLException;
    void delete(K id) throws SQLException;
    void close_connection() throws SQLException;

}
