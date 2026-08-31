DO $$
BEGIN
    IF EXISTS (SELECT 1 FROM users WHERE email = 'siva@gmail.com') THEN
UPDATE users
SET email = 'ananya@gmail.com',
    name = 'Ananya',
    password = '$2b$10$ruX04FmFX.uzlCZbmFNUEufAXM9rpA9bDPi6QsfoLRboTUfIDa/vq'
WHERE email = 'siva@gmail.com';
ELSIF EXISTS (SELECT 1 FROM users WHERE email = 'ananya@gmail.com') THEN
UPDATE users
SET password = '$2b$10$ruX04FmFX.uzlCZbmFNUEufAXM9rpA9bDPi6QsfoLRboTUfIDa/vq'
WHERE email = 'ananya@gmail.com';
ELSE
        INSERT INTO users (email, password, name, role)
        VALUES ('ananya@gmail.com', '$2b$10$ruX04FmFX.uzlCZbmFNUEufAXM9rpA9bDPi6QsfoLRboTUfIDa/vq', 'Ananya', 'ROLE_USER');
END IF;
END $$;