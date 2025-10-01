package learn.babycare.data.mappers;

import learn.babycare.models.CareLog;
import learn.babycare.models.CareTypes;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class CareLogMapper implements RowMapper<CareLog> {

    @Override
    public CareLog mapRow(ResultSet rs, int rowNum) throws SQLException {
        return new CareLog(
                rs.getInt("log_id"),
                BabyMapper.makeBaby(rs),
                UserMapper.makeUser(rs),
                CareTypes.valueOf(rs.getString("type").toUpperCase()),
                rs.getString("details"),
                rs.getTime("timestamp").toLocalTime()
        );
    }
}
