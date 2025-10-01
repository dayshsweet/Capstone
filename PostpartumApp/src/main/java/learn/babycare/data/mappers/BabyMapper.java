package learn.babycare.data.mappers;

import learn.babycare.models.Baby;
import org.springframework.jdbc.core.RowMapper;

import java.nio.file.attribute.UserPrincipal;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BabyMapper implements RowMapper<Baby> {

    @Override
    public Baby mapRow(ResultSet rs, int rowNum) throws SQLException {
        return makeBaby(rs);
    }

    public static Baby makeBaby(ResultSet rs) throws SQLException {
        return new Baby(
                rs.getInt("baby_id"),
                rs.getString("name"),
                rs.getDate("birthdate").toLocalDate(),
                rs.getString("gender"),
                UserMapper.makeUser(rs)
        );

    }
}
