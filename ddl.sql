CREATE TABLE `users` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `city` varchar(255) NOT NULL,
  `email` varchar(255) NOT NULL,
  `name` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=101 DEFAULT CHARSET=utf8;
SELECT * FROM netgloo_blog.users;

CREATE TABLE `sub_users` (
  `id` bigint(20) NOT NULL,
  `sub_id` bigint(20) NOT NULL,
  `sub_name` varchar(255) NOT NULL,
  PRIMARY KEY (`id`,`sub_id`),
  CONSTRAINT `fk` FOREIGN KEY (`id`) REFERENCES `users` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
