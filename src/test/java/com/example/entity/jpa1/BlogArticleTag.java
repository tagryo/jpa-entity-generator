package com.example.entity.jpa1;

import java.io.Serializable;
import java.sql.*;
import javax.persistence.*;
import lombok.Data;
import lombok.ToString;

/**
 * Note: auto-generated by jpa-entity-generator
 */
@Data
@ToString
@Entity(name = "com.example.entity.jpa1.BlogArticleTag")
@Table(name = "article_tag")
public class BlogArticleTag implements Serializable {

  public Integer getId() { return this.id; }

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "`id`", nullable = false)
  private Integer id;
  /**
   * database comment for article_id
   * The field is non-null value
   */
  @Column(name = "`article_id`", nullable = false)
  private Integer articleId;
  /**
   * database comment for blog_id
   * The field is non-null value
   */
  @Column(name = "`tag_id`", nullable = false)
  private Integer tagId;
  @Column(name = "`created_at`", nullable = false)
  private Timestamp createdAt;
}