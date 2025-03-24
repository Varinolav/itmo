create or replace function update_communication_status()
    returns trigger as
$$
begin
    update computer
    set communication_status = exists(select 1
                                      from computer_consultation cc
                                               join consultation c on cc.consultation_id = c.id
                                      where cc.computer_id = computer.id
                                        and NOW() BETWEEN c.start_time and c.end_time)
    where computer.id = OLD.computer_id or computer.id = NEW.computer_id;
    return NEW;
end;
$$ language plpgsql;

create trigger trigger_comm_status
    after insert or update or delete
    on computer_consultation
    for each row
execute function update_communication_status();